package best.hyun.pgrc.type.kaki

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Horku : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_horku)
    override val type: PET_TYPE
        get() = PET_TYPE.KAKI
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_horku)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WIND
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.EARTH
    override val mainElementalValue: Int
        get() = 70
    override val subElementalValue: Int
        get() = 30
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 37
    override val initLvMaxAtk: Int
        get() = 8
    override val initLvMaxDef: Int
        get() = 5
    override val initLvMaxSpd: Int
        get() = 7
    override val maxLvMaxHp: Int
        get() = 1341
    override val maxLvMaxAtk: Int
        get() = 306
    override val maxLvMaxDef: Int
        get() = 196
    override val maxLvMaxSpd: Int
        get() = 268
    override val initLvMinHp: Int
        get() = 28
    override val initLvMinAtk: Int
        get() = 6
    override val initLvMinDef: Int
        get() = 3
    override val initLvMinSpd: Int
        get() = 6
    override val maxLvMinHp: Int
        get() = 1133
    override val maxLvMinAtk: Int
        get() = 268
    override val maxLvMinDef: Int
        get() = 158
    override val maxLvMinSpd: Int
        get() = 237
    override val minAllGrowth: Double
        get() = 4.693
    override val maxAllGrowth: Double
        get() = 5.400
}