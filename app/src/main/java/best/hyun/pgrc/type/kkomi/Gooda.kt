package best.hyun.pgrc.type.kkomi

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Gooda : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_gooda)
    override val type: PET_TYPE
        get() = PET_TYPE.KKOMI
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_gooda)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WATER
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.FIRE
    override val mainElementalValue: Int
        get() = 80
    override val subElementalValue: Int
        get() = 20
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 57
    override val initLvMaxAtk: Int
        get() = 13
    override val initLvMaxDef: Int
        get() = 8
    override val initLvMaxSpd: Int
        get() = 8
    override val maxLvMaxHp: Int
        get() = 1446
    override val maxLvMaxAtk: Int
        get() = 337
    override val maxLvMaxDef: Int
        get() = 201
    override val maxLvMaxSpd: Int
        get() = 224
    override val initLvMinHp: Int
        get() = 44
    override val initLvMinAtk: Int
        get() = 10
    override val initLvMinDef: Int
        get() = 5
    override val initLvMinSpd: Int
        get() = 7
    override val maxLvMinHp: Int
        get() = 1236
    override val maxLvMinAtk: Int
        get() = 299
    override val maxLvMinDef: Int
        get() = 163
    override val maxLvMinSpd: Int
        get() = 192
    override val minAllGrowth: Double
        get() = 4.575
    override val maxAllGrowth: Double
        get() = 5.282
}