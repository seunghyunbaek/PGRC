package best.hyun.pgrc.type.manmo

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Manmonas : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_manmonas)
    override val type: PET_TYPE
        get() = PET_TYPE.MANMO
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_manmonas)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.EARTH
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WATER
    override val mainElementalValue: Int
        get() = 70
    override val subElementalValue: Int
        get() = 30
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 76
    override val initLvMaxAtk: Int
        get() = 10
    override val initLvMaxDef: Int
        get() = 7
    override val initLvMaxSpd: Int
        get() = 4
    override val maxLvMaxHp: Int
        get() = 2026
    override val maxLvMaxAtk: Int
        get() = 268
    override val maxLvMaxDef: Int
        get() = 184
    override val maxLvMaxSpd: Int
        get() = 104
    override val initLvMinHp: Int
        get() = 63
    override val initLvMinAtk: Int
        get() = 7
    override val initLvMinDef: Int
        get() = 4
    override val initLvMinSpd: Int
        get() = 2
    override val maxLvMinHp: Int
        get() = 1808
    override val maxLvMinAtk: Int
        get() = 228
    override val maxLvMinDef: Int
        get() = 144
    override val maxLvMinSpd: Int
        get() = 71
    override val minAllGrowth: Double
        get() = 3.130
    override val maxAllGrowth: Double
        get() = 3.865
}