package best.hyun.pgrc.type.rare

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Morax : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_morax)
    override val type: PET_TYPE
        get() = PET_TYPE.RARE
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_morax)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WATER
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.FIRE
    override val mainElementalValue: Int
        get() = 70
    override val subElementalValue: Int
        get() = 30
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 74
    override val initLvMaxAtk: Int
        get() = 15
    override val initLvMaxDef: Int
        get() = 11
    override val initLvMaxSpd: Int
        get() = 7
    override val maxLvMaxHp: Int
        get() = 1641
    override val maxLvMaxAtk: Int
        get() = 352
    override val maxLvMaxDef: Int
        get() = 253
    override val maxLvMaxSpd: Int
        get() = 163
    override val initLvMinHp: Int
        get() = 59
    override val initLvMinAtk: Int
        get() = 13
    override val initLvMinDef: Int
        get() = 8
    override val initLvMinSpd: Int
        get() = 5
    override val maxLvMinHp: Int
        get() = 1430
    override val maxLvMinAtk: Int
        get() = 314
    override val maxLvMinDef: Int
        get() = 214
    override val maxLvMinSpd: Int
        get() = 131
    override val minAllGrowth: Double
        get() = 4.589
    override val maxAllGrowth: Double
        get() = 5.296
}